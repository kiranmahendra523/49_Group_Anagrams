class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lt = new ArrayList();
        if(strs.length==0){
            return lt;
        }
        if(strs.length==1){
            List<String> s = new ArrayList();
            s.add(strs[0]);
            lt.add(s);
            return lt;
        }
        List<String> ab = new ArrayList();
        for(String s : strs){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String x = new String(tmp);
            if(ab.isEmpty()){
                ab.add(x);
                List<String> st = new ArrayList();
                st.add(s);
                lt.add(st);
            }
            else{
                if(ab.contains(x)){
                    int l = ab.indexOf(x);
                    List<String> t = lt.get(l);
                    t.add(s);
                }
                else{
                    ab.add(x);
                    List<String> t = new ArrayList();
                    t.add(s);
                    lt.add(t);
                }
            }
        }
        return lt;
    }
}
