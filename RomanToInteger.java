class RomanToInteger{
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    static int romanToInt(String s){
        int sum = 0;
        int n = s.length();
        s = s.toUpperCase();
        if(n == 1){
            switch (s.charAt(0)) {
                case 'I' -> sum += 1;
                case 'V' -> sum += 5;
                case 'X' -> sum += 10;
                case 'L' -> sum += 50;
                case 'C' -> sum += 100;
                case 'D' -> sum += 500;
                case 'M' -> sum += 1000;
                default -> {
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i == (n-1)){
                    switch (s.charAt(i)) {
                        case 'I' -> sum += 1;
                        case 'V' -> sum += 5;
                        case 'X' -> sum += 10;
                        case 'L' -> sum += 50;
                        case 'C' -> sum += 100;
                        case 'D' -> sum += 500;
                        case 'M' -> sum += 1000;
                        default -> {
                    }
            }
                }
                else{
                    if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                        sum += 4;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                        sum += 9;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                        sum += 40;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                        sum += 90;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                        sum += 400;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                        sum += 900;
                        i+=1;
                    }
                    else if(s.charAt(i) == 'I'){
                        sum += 1;
                    }
                    else if(s.charAt(i) == 'V'){
                        sum += 5;
                    }
                    else if(s.charAt(i) == 'X'){
                        sum += 10;
                    }
                    else if(s.charAt(i) == 'L'){
                        sum += 50;
                    }
                    else if(s.charAt(i) == 'C'){
                        sum += 100;
                    }
                    else if(s.charAt(i) == 'D'){
                        sum += 500;
                    }
                    else if(s.charAt(i) == 'M'){
                        sum += 1000;
                    }
                }
            }

        }
        return sum;
    }
}