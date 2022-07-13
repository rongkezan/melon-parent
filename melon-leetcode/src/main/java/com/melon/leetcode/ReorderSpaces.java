package com.melon.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 重新排列单词间的空格
 * <p>
 * 给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。
 * <p>
 * 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也意味着返回的字符串应当与原 text 字符串的长度相等。
 * <p>
 * 返回 重新排列空格后的字符串 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rearrange-spaces-between-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author keith
 */
public class ReorderSpaces {

    public static void main(String[] args) {
        String text = "a";
        String result = reorderSpaces(text);
        System.out.println(result);
    }

    private static String reorderSpaces(String text) {
        List<String> words = new ArrayList<>();
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            } else {
                int j = i + 1;
                while (j < text.length() && text.charAt(j) != ' ') {
                    j++;
                }
                words.add(text.substring(i, j));
                i = j - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (words.size() == 1) {
            sb.append(words.get(0));
            for (int j = 0; j < spaceCount; j++) {
                sb.append(" ");
            }
        } else {
            int spaceCnt = spaceCount / (words.size() - 1);
            for (int i = 0; i < words.size(); i++) {
                sb.append(words.get(i));
                if (i < words.size() - 1) {
                    for (int j = 0; j < spaceCnt; j++) {
                        sb.append(" ");
                        spaceCount--;
                    }
                } else {
                    for (int j = 0; j < spaceCount; j++) {
                        sb.append(" ");
                    }
                }
            }
        }

        return sb.toString();
    }
}
