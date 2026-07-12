class Solution {
    public String reverseWords(String s) {
        int l = 0, r = s.length() - 1;
        while (l < s.length()) {
            if (s.charAt(l) == ' ') {
                l++;
            } else {
                break;
            }
        }

        while (r >= 0) {
            if (s.charAt(r) == ' ') {
                r--;
            } else {
                break;
            }
        }

        StringBuilder sB = new StringBuilder();

        while (l <= r) {
            if (s.charAt(l) != ' ') {
                sB.append(s.charAt(l));
                l++;
            } else if (s.charAt(l) == ' ') {
                if (sB.charAt(sB.length() - 1) != ' ') {
                    sB.append(' ');
                    l++;
                } else {
                    l++;
                }
            }
        }
        int i = 0;
        int j = sB.length() - 1;
        while (i < j) {
            char temp = sB.charAt(i);
            sB.setCharAt(i, sB.charAt(j));
            sB.setCharAt(j, temp);
            i++;
            j--;
        }

        int start = 0;
        int end = 0;
        while (start < sB.length()) {
            while (end < sB.length() && sB.charAt(end) != ' ') {
                end++;
            }
            int p1 = start, p2 = end-1;
            while (p1 < p2) {
                char temp = sB.charAt(p1);
                sB.setCharAt(p1, sB.charAt(p2));
                sB.setCharAt(p2, temp);
                p1++;
                p2--;
            }
            start = end + 1;
            end = start;
        }
        return sB.toString();
    }
}