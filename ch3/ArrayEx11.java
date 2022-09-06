class ArrayEx11 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i = 0; i<numArr.length; i++) System.out.print(numArr[i] = (int)(Math.random()*numArr.length));
        System.out.println();
        for(int i = 0 ; i<numArr.length;i++) counter[numArr[i]]++;
        for(int temp : counter) System.out.print(temp);
        System.out.println();
    }
}