
object q_04 {
  def main (args : Array[String]) : Unit = {

    var most_profitable_ticket_price : Int = 0
    var curr_ticket_price : Int = 5
    var previous_profit : Int = 0

    while(attendance(curr_ticket_price) > 0) {
      var curr_profit = profit(curr_ticket_price)
      println(s"when ticket price is $curr_ticket_price, profit is - $curr_profit")

      if (curr_profit < previous_profit && most_profitable_ticket_price == 0) {
        most_profitable_ticket_price = curr_ticket_price - 5

      }

      previous_profit = curr_profit
      curr_ticket_price += 5
    }

    println(s"\n\n the best ticket price is $most_profitable_ticket_price")

  }
  def attendance (ticket_price : Int) = 100 -  ((ticket_price - 20) * 4)
  def income (ticket_price : Int) = ticket_price * attendance(ticket_price)
  def attendee_cost (ticket_price : Int) = attendance(ticket_price) * 3
  // profit = income - 500 - attendee_cost
  def profit (ticket : Int) = income(ticket) - 500 - attendee_cost(ticket)

}