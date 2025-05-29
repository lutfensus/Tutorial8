package src;

interface MediaItem {
    static final String LIBRARY_NAME = "Digital Commons Library";

    String getTitle();
    int getYear();
    String getDisplayString();
}
