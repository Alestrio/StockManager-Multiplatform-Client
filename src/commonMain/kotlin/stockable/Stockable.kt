package stockable

class Stockable(val properties:PropertySet) {
    fun addProperty(prop:StockableProperty<*>){
        this.properties.add(prop)
    }

    fun deleteProperty(prop:StockableProperty<*>){
        this.properties.remove(prop)
    }

    fun setProperties(props:ArrayList<StockableProperty<*>>){
        this.properties.addAll(props)
    }
}