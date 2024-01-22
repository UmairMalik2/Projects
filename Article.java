class Article {
    int id;
    String title;
    String author;
    
    public Article(int i, String t, String a) {
        id = i;
        title = t;
        author = a;
    }
    
    public String toString() {
        return String.format("\t %d | %s | %s-->\n", id, title, author);
    }
}