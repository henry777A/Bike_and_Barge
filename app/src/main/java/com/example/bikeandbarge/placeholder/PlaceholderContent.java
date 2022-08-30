package com.example.bikeandbarge.placeholder;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<>();

    static {
        // Add some sample items.
        addItem(new PlaceholderItem("1", "Photos"));
        addItem(new PlaceholderItem("2", "Tour"));
        addItem(new PlaceholderItem("3", "Web Site", "https://www.bikebarge.com"));
    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String id;
        public final String content;
        //public final String item_name;
        public final String item_url;

        public PlaceholderItem(String id, String content) {
            this.id = id;
            this.content = content;
            this.item_url = null;
        }

        public PlaceholderItem(String id, String content, String item_url) {
            this.id = id;
            this.content = content;
            this.item_url = item_url;
        }

        @NonNull
        @Override
        public String toString() {
            return content;
        }
    }
}