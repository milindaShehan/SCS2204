/*
4. Imagine the owner of a movie theater who has complete freedom in
setting ticket prices. The more he charges, the fewer the people who can afford
tickets. In a recent experiment the owner determined a precise relationship
between the price of a ticket and average attendance.
At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing
the price by 5 Rupees increases attendance by 20 and increasing the price by 5
Rupees decreases attendance by 20.
Unfortunately, the increased attendance also comes at an increased cost. Every
performance costs the owner Rs.500. Each attendee costs another 3 Rupees.
The owner would like to know the exact relationship between profit and ticket
price so that he can determine the price at which he can make the highest profit.
Implement a functional program to find out the best ticket price.
 */
object q_04 {
  def main (args : Array[String]) : Unit = {

    var most_profitable_ticket_price : Int = 0
    var curr_ticket_price : Int = 5
    var previous_profit : Int = -1000

    while(attendance(curr_ticket_price) > 0) {
      var curr_profit = profit(curr_ticket_price)
      println(s"when ticket price is $curr_ticket_price, profit is - $curr_profit")

      if (curr_profit > previous_profit ) {
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