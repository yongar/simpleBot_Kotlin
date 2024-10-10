fun countStrings(list: List<Any>): Int {
    // make your code here
    for (i in list) {
        if (i is String) {
            return list.count { it is String }
        }
    }
    return 0
}
