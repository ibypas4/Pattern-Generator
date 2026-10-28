//  Class author:  Ivy Pascover
//  Date created:  10/28/26
//  General description: creates patterns with different amounts of rows

public class PatternGenerator {

//  Pre-condition: rows is a positive integer
//  Post-condition: a stars forming a triangle with the amount of rows in the call
public static void stars(int rows){
    String output="*";
    while(0<rows){
        System.out.println(output);
        output=output+"**";
        rows--;
    }
    System.out.println();
}

//  Pre-condition: rows is a positive integer
//  Post-condition: a triangle made of numbers thaat arer the number for the amount of numbers in that row
//  has rows amount of rows
public static void triangle(int rows){
    int i=0;
    while(i<=rows){
        int j=0;
        while(j<i){
        System.out.print(i);
        j++;
        }
        System.out.println();
        i++;
    }
    System.out.println();
}

//  Pre-condition: start is a positive integer
//  Post-condition: triangle of numbers with that amount of numbers that go until it gets to zero using only odd numbers
public static void odds(int start){
    for(;start>0;start--){
        if(start%2!=0){
            for(int i=0;i<start;i++){
                System.out.print(start);
            }
            System.out.println();
        }
    }
    System.out.println();
}

//  Pre-condition: maxE is a positive integer
//  Post-condition: increasing then decreasng amount of e's or o's in the row and the row with the most letters is made of e's and has maxE amount of them
public static void eo(int maxE){
    Boolean parity=maxE%2==0;
    for(int i=0;i<=maxE;i++){
        for(int j=0;j<i;j++){
            if(parity){
                System.out.print("E");
            }else{
                System.out.print("O");
            }
        } 
        parity=!parity; 
        System.out.println(); 
    }
    maxE--;
    for(;maxE>0;maxE--){
        for(int j=0;j<maxE;j++){
            if(parity){
                System.out.print("E");
            }else{
                System.out.print("O");
            }
        } 
        parity=!parity; 
        System.out.println(); 
    }
    System.out.println();
}

//  Pre-condition: rows is a positive integer
//  Post-condition: creats an upside doown ppyramid made of numbers that are the row number and decrease 
// the amount of the numbers as it goes and it is centered 
public static void pyramid(int rows){
    int amount=rows*2;
    String space="";
    for(int i=1;i<=rows;i++){
        System.out.print(space);
        for(int j=1;j<amount;j++){
            System.out.print(i);
        }
        System.out.println(space);
        amount-=2;
        space=space+" ";
    }
    System.out.println();
}


public static void main(String[] args){
    stars(7);
    triangle(9);
    odds(9);
    eo(6);
    eo(5);
    pyramid(5);
}

}