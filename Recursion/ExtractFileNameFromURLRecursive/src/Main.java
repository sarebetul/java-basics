public class Main {
    public static String findFile(String url, int index) {
        if (index < 0) {
            return "";
        }
        if (url.charAt(index) == '/') {
            return url.substring(index + 1);
        }
        return findFile(url, index - 1);
    }
    public static void main(String[] args) {
        String url = "http://example.com/file.txt";
        String fileName = findFile(url, url.length() - 1);
        System.out.println("Dosya adı: " + fileName);
    }
}