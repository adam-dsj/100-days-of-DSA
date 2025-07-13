class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            String sorted = sortString(word);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(word);
        }
        return convertToList(map);
    }

    private String sortString(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private List<List<String>> convertToList(Map<String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> anagrams : map.values()) {
            result.add(anagrams);
        }
        return result;
    }
}