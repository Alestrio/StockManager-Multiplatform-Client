package stockable

data class StockableProperty<T>(var databaseName: String, var value:T) {
    fun getValue(): T {
        return this.value
    }

    fun setValue(newValue:T){
        this.value = newValue
    }

    fun sanityCheck(): Boolean{
        TODO("Sanity check")
    }
}

class PropertySet: Collection<StockableProperty<*>> {
    private var propList = ArrayList<StockableProperty<*>>()
    fun getValueType(id:Int):Any{
        return when(propList[id].getValue()){
            is String -> String
            is Int -> Int
            is Double -> Double
            is Boolean -> Boolean
            else -> throw Exception("Unknown Type")
        }
    }

    override val size: Int
        get() = propList.size

    override fun contains(element: StockableProperty<*>): Boolean {
        return (propList.contains(element))
    }

    override fun containsAll(elements: Collection<StockableProperty<*>>): Boolean {
        return (propList.containsAll(elements))
    }

    override fun isEmpty(): Boolean {
        return (propList.isEmpty())
    }

    override fun iterator(): Iterator<StockableProperty<*>> {
        return (propList.iterator())
    }

    fun add(element: StockableProperty<*>){
        if (element.sanityCheck() and !propList.contains(element)) {
            propList.add(element)
        }
    }

    fun remove(element: StockableProperty<*>){
        if (propList.contains(element)){
            propList.remove(element)
        }
    }

    fun addAll(elements: Collection<StockableProperty<*>>){
        if (propList.containsAll(elements)){
            propList.addAll(elements)
        }
    }


}