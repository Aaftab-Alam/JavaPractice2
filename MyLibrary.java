class Operations{
    String[] arr= new String[10];
    String[] issuedBooks=new String[10];
    int issCount=0;
    int count=0;

    void addBook(String name,int flag){
        if(count>=10){
            System.out.println("Library is full");
        }
        else{
        arr[count]=name;
        count=count+1;
        System.out.println(name+ " Book returned Successfully");
        }
    }
    void addBook(String name){
        if(count>=10){
            System.out.println("Library is full");
        }
        else{
        arr[count]=name;
        count=count+1;
        System.out.println(name+ " Book added Successfully");
        }
    }
    void showLib(){
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }
    void issueBook(String name){
        for(int i=0;i<count;i++){
            if (arr[i]==name){
                issuedBooks[issCount]=name;
                issCount+=1;
                for(int j=i;j<count;j++){
                    arr[j]=arr[j+1];
                }
                count-=1;
            }
        else{
            System.out.println(name+ " Book not Found");
        }
        }
    }
    void returnBook(String name){
        addBook(name,1);
        for(int i=0;i<issCount;i++){
            if(issuedBooks[i]==name){
                for(int j=i;j<issCount;j++){
                    issuedBooks[j]=issuedBooks[j+1];
                }
            }
        }
    }
}

class MyLibrary{
    public static void main(String[] args) {
        Operations obj=new Operations();
        obj.addBook("Harry Potter");
        obj.addBook("Game of Thrones");
        obj.showLib();
        obj.issueBook("Harry Potter");
        obj.issueBook("Witcher");
        obj.showLib();
        obj.returnBook("Harry Potter");
        System.out.println("Final Linrary");
        obj.showLib();

        
    }
}