List(1, 2, 3, 4, 5).filter(_ > 3)

List(1, 2, 3, 4, 5).foreach(println _)

def echo(args: String*) = for (arg <- args) println(arg);

echo();
echo("one");
echo("hello", "world");

def speed(distance: Float, time: Float) = distance / time;

speed(100, 10);
speed(time = 10, distance = 100);