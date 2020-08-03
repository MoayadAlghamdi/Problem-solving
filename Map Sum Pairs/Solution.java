class MapSum {

    /**
     * Initialize your data structure here.
     */
    HashMap<String, Integer> list;
    int value;

    public MapSum() {
        list = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        if (list.toString().equals(key)) {
            list.put(key, val);
        } else {
            list.put(key, val);
        }
    }

    public int sum(String prefix) {
        value = 0;
        list.forEach((k, v) -> {
            if (k.startsWith(prefix)) {
                value += v;
            }
        });
        return value;
    }
}
