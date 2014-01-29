public class NewEmpty{
    
    public static void main(String[] args){

String[] strings = new String[] { "A ", "B ", "C "};
for (int i = 0; i < strings.length; i++) {
System.out.println(strings[i]);
for (int j = 2; j >= 0; --j) {
System.out.print(strings[j]);
}
}
    }
}

/* 
prints out
A 
C B A B 
C B A C 
C B A
*/