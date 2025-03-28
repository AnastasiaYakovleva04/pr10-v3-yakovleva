open class InStockProduct(): Product(), Info {
    override var name: String = "?"
    override var price: Double = 0.0
    override var quanity: UInt = 0u
    override fun CalculateUnitPrice(): Double {
        return price/quanity.toDouble()
    }

    override fun PrintInfo(name: String, price: Double, quanity: UInt): String {
        return "Товар: $name\nЦена: $price\nКоличество: $quanity"
    }
}