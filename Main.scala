object Main extends App {
val printer = (board: Array[Array[Int]], hit: (Array[Array[Int]]) => Unit, hider: Int => Int) => {
    hit(board);
    board.map(arr => println(arr.map(hider).foldLeft("")(_ + " " + _)));
    println(" +-------+");
    !board.find(_.find(_ == 1).isDefined).isDefined;
  }
  val computerHit = (board: Array[Array[Int]]) => board(scala.util.Random.nextInt(5))(scala.util.Random.nextInt(5)) += 2;
  val playerHit = (board: Array[Array[Int]]) => board(scala.io.StdIn.readLine("Define an X coordinate: ").toInt)(scala.io.StdIn.readLine("Define a Y coordinate: ").toInt) += 2;
  val playerOne, playerTwo: Array[Array[Int]] = Array.fill(5)(scala.util.Random.shuffle(Array(2, 4, 6, 8, 9).map(_ % 2)).toArray);
  while (true) if (printer(playerTwo, playerHit, Map(1 -> 0).orElse(i => i)) || printer(playerOne, computerHit, Map(1 -> 1).orElse(i => i))) scala.util.control.Breaks.break();
}
