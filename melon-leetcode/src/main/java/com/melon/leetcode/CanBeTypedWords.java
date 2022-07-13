package com.melon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可以输入的最大单词数
 * <p>
 * 键盘出现了一些故障，有些字母键无法正常工作。而键盘上所有其他键都能够正常工作。
 * <p>
 * 给你一个由若干单词组成的字符串 text ，单词间由单个空格组成（不含前导和尾随空格）；另有一个字符串 brokenLetters ，由所有已损坏的不同字母键组成，返回你可以使用此键盘完全输入的 text 中单词的数目。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-number-of-words-you-can-type
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author keith
 */
public class CanBeTypedWords {

    public static void main(String[] args) {
        String text = "leet code", brokenLetters = "lt";
        int count = canBeTypedWords(text, brokenLetters);
        System.out.println(count);
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        List<String> words = Arrays.asList(text.split(" "));
        int num = words.size();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = 0; j < brokenLetters.length(); j++) {
                char c = brokenLetters.charAt(j);
                if (word.contains(Character.toString(c))) {
                    num--;
                    break;
                }
            }
        }
        return num;
    }
}
