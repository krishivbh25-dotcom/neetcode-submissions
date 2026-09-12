
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> listOfLists = new ArrayList<>();
        boolean[] visited = new boolean[n]; // tracks strings already placed in a group

        // Build a character-count map for every string
        List<Map<Character, Integer>> maps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                map.put(strs[i].charAt(j), map.getOrDefault(strs[i].charAt(j), 0) + 1);
            }
            maps.add(map);
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // already grouped, skip

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int k = i + 1; k < n; k++) {
                if (!visited[k] && maps.get(i).equals(maps.get(k))) {
                    group.add(strs[k]);
                    visited[k] = true;
                }
            }

            listOfLists.add(group);
        }

        return listOfLists;
    }
}