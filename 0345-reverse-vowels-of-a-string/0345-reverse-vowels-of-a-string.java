class Solution {
    public String reverseVowels(String s) {

    
    char ch[]=s.toCharArray();
    

     int i=0,j=s.length()-1;
     while(i<j){
        if(!isvowel(ch[i])){
            i++;
        }else if(! isvowel(ch[j])){
            j--;
        }else{
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;


        }
     }
     return new String(ch);
    }
        public  boolean isvowel(char ch){
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }
     }
    