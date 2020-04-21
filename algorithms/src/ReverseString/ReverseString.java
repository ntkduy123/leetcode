package algorithms.src.ReverseString;

public class ReverseString {
    public void reverseString(char[] s) {
        swap(0, s.length - 1, s);
    }

    public void swap(int left, int right, char[] s) {
        if (left >= right) {
            return;
        }
        char temp;

        temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        swap(left + 1, right - 1, s);
    }
}
