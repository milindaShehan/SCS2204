object Main {

  def main(args: Array[String]): Unit = {
    // Problem 1
    val diskRadius = 5
    val diskArea = calculateDiskArea(diskRadius)
    println(s"Area of the disk with radius $diskRadius = $diskArea")

    // Problem 2
    val celsius = 35
    val fahrenheit = convertCelsiusToFahrenheit(celsius)
    println(s"$celsius °C = $fahrenheit °F")

    // Problem 3
    val sphereRadius = 5
    val sphereVolume = calculateSphereVolume(sphereRadius)
    println(s"Volume of the sphere with radius $sphereRadius = $sphereVolume")

    // Problem 4
    val numCopies = 60
    val wholesaleCost = calculateWholesaleCost(numCopies)
    println(s"Wholesale Cost for $numCopies copies = Rs. $wholesaleCost")

    // Problem 5
    val runningTime = calculateRunningTime()
    println(runningTime)
  }

  def calculateDiskArea(r: Double): Double = {
    val pi = 3.141592653589793238
    pi * r * r
  }

  def convertCelsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  def calculateSphereVolume(r: Double): Double = {
    val pi = 3.141592653589793238
    (4.0 / 3.0) * pi * Math.pow(r, 3)
  }

  def calculateWholesaleCost(numCopies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val shippingCostFirst50 = 3.0
    val shippingCostAdditional = 0.75

    val discountedPrice = coverPrice * (1 - discount)
    val totalShippingCost =
      if (numCopies <= 50)
        shippingCostFirst50
      else
        shippingCostFirst50 + (numCopies - 50) * shippingCostAdditional

    val totalCost = numCopies * discountedPrice + totalShippingCost
    totalCost
  }

  def calculateRunningTime(): String = {
    val easyPaceDistance = 2.0
    val tempoDistance = 3.0
    val easyPaceTimePerKm = 8.0
    val tempoTimePerKm = 7.0

    val totalTime = easyPaceDistance * easyPaceTimePerKm + tempoDistance * tempoTimePerKm + easyPaceDistance * easyPaceTimePerKm
    val hours = totalTime.toInt / 60
    val minutes = totalTime.toInt % 60

    s"Total Running Time: $hours hours $minutes minutes"
  }
}
