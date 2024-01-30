public static void main(String[] args) {
    print();
}
public static void print() {//
//BEGIN
    for (int y = 0; y < 10; y++) {

        for (int x = 0; x < 10; x++) {
            if (x == y && x <= 9 || 9 - x == y && y < 9 || x == 9 || x == 0)
                System.out.print(" * ");
            else
                System.out.print("   ");
        }
        System.out.println();

    }
        print1();
    }
    public static void print1 () {//
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (x==y && x<=8 || 9-x==y && x<9|| y==9 || y==0)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
//git init
//git add .
//git remote add origin https://github.com/Pro100Den07/hw1.git
//git commit -m "first commit"
//git push -u origin main
