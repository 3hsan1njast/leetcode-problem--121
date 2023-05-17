import kotlin.math.max

fun main() {
    val prices = arrayListOf(7, 1, 5, 3, 6, 4)
    var dayBuy = 0
    var daySell = 1
    var maxProfit = 0

    while (daySell < prices.size) {
        val currentProfit = prices[daySell] - prices[dayBuy]
        if (prices[dayBuy] < prices[daySell]) {
            maxProfit = max(currentProfit, maxProfit)
        } else {
            dayBuy = daySell
        }
        daySell++
    }

    println(maxProfit)
}