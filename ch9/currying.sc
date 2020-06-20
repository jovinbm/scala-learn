def plainOldSum(x: Int, y: Int) = x + y

plainOldSum(1,2)

def curriedSum(x: Int)(y: Int) = x + y;

curriedSum(1)(2)

val onePlus = curriedSum(1)_;

onePlus(2);