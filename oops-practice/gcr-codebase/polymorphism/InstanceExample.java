//Upcasting
//Downcasting
//instanceof

// public class InstanceExample {
    
// }

// class ChildOne extends InstanceExample{  //scope childOne mein chala jayega jab neeche upcast karenge.
    
// }

// class ChildTwo extends InstanceExample{

// }

// class ChildThree extends InstanceExample{

// }

// class Main
// {
//     public static void main(String[] args) {
//         InstanceExample [] e = {
//             new ChildOne(),
//             new ChildTwo(),
//             new ChildThree()
//         };

//         InstanceExample e = new ChildOne(); //upcasting = non-primitive typecasting.
//         // ChildOne one = (ChildOne)e;  //upcast sirf childOne se childOne mein hi ho sakta hai. childtwo ya kisi aur child class mein nahi.
//         // InstanceExample e = new ChildTwo();
//         // e.add(); //problem = cannot find which add method to called , solution is instanceOf.
//         if(e instanceof ChildOne){
//             ChildOne one = (ChildOne)e;  //downcasting
//         }
        
//     }
// }