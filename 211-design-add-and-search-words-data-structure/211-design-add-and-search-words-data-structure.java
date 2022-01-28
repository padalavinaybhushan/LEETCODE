class WordDictionary {

    HashMap<Integer,HashSet<String>> hs ;
    public WordDictionary() {
        hs = new HashMap<>();;
    }
    
    public void addWord(String word) {
        
        if(hs.containsKey(word.length()))
        {
            HashSet<String> tem = hs.get(word.length());
            tem.add(word);
            hs.put(word.length(),tem);
        }
        else
        {
            HashSet<String> tem = new HashSet<>();
            tem.add(word);
            hs.put(word.length(),tem);
        }
    }
    
    public boolean search(String word) {
        if(!hs.containsKey(word.length()))
        {
            return false;
        }
        if(word.indexOf(".")>-1)
        {
            HashSet<String> tem = hs.get(word.length());
            for(String str : tem)
            {
                if(str.length() == word.length())
                {
                    int len = str.length();
                    int i=0;
                    for(i=0;i<len;i++)
                    {
                        if(word.charAt(i) != '.' && str.charAt(i) != word.charAt(i))
                        {
                         break;   
                        }
                    }
                    if(i == len)
                    {
                        return true;
                    }
                }
            }
            return false;
        }
        else
        {
            return hs.get(word.length()).contains(word);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */