abstract class State;
case object Beach1 extends State;
case object Beach2 extends State;
case object Raft extends State;

abstract class Person;
case object Dad extends Person;
case object Mom extends Person;
case object Pol extends Person;
case object Thief extends Person;
case object Boy1 extends Person;
case object Boy2 extends Person;
case object Girl1 extends Person;
case object Girl2 extends Person;


abstract class RaftPos(pos: Int);
case object RaftOnBeach1 extends RaftPos(1);
case object RaftOnBeach2 extends RaftPos(2);

implicit def persons2Str(persons: List[Person]) {
    persons.mkString(",");
		//persons.reduceLeft(_.toString+","+_.toString);
}

case class GameState(beach1Persons: List[Person], raftPersons: List[Person], beach2Persons: List[Person], raftPos: RaftPos) {
    
  override def toString() = { beach1Persons.mkString(",").format(15) + "   |" + //{if raftPos=RafOnBeach1 then "R" else ""} + 
	                            raftPersons.mkString(",")   + "|   " + 
															beach2Persons.mkString(",") }
}

println( GameState(List(Dad), List(), List(), RaftOnBeach1) );