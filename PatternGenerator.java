//  Class author:  Ivy Pascover
//  Date created:  10/28/26
//  General description: creates patterns based on input

public class PatternGenerator {



//  Pre-condition: rows is a positive integer
//  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
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
//  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
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

//  Pre-condition: rows is a positive integer
//  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
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

//  Pre-condition: rows is a positive integer
//  including possible limitations on input
//  Post-condition: what the result of executing this method will be.
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
}


public static void main(String[] args){
    stars(7);
    triangle(9);
    odds(9);
    eo(6);
    eo(5);
}

}