class Laptop():InStockProduct() {
    var releaseYear: UInt = 1900u
    val currentYear: UInt = 2025u
    fun a(): Double{
        return (CalculateUnitPrice() + 0.5*(currentYear.toDouble()-releaseYear.toDouble()))
    }

    override fun PrintInfo(name: String, price: Double, quanity: UInt): String {
        return super.PrintInfo(name, price, quanity) + "\nГод выпуска: $releaseYear"
    }
}