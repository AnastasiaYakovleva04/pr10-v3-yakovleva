abstract class Product() {
    abstract val name: String
    abstract val price: Double
    abstract val quanity: UInt
    abstract fun CalculateUnitPrice():Double
}