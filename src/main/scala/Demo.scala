import monocle.Lens

object Demo extends App {
  val nameLens = Lens.apply[Person, Name](person => person.name)(newName => person => person.copy(name=newName))
  val name:Name = Name(FirstName("Tom"), Surname("Smith"))
  val age:Age = Age(23)
  val p: Person = Person(name, age)
  val newName = Name(FirstName("TEST"), Surname("NEW TEST"))
  println(nameLens.get(p))
  println(nameLens.modify(x => newName)(p))
}
