class ReverseInteger {
    public static void main(String[] args) {
        int x = 120;
        
        String value = String.valueOf(x);
        char[] ch = new char[value.length()];
        int index = 0;
        if(x < 0){
         ch[index++] = '-';   
        }
        for(int i=value.length()-1;i>-1;i--){
            if(value.charAt(i) == '-' || value.charAt(i) == '0')
                continue;
            else
                ch[index++] = value.charAt(i);
        }
        value = new String(ch);
        System.out.println(value);
    }
}