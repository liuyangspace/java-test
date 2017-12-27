package language.data;

class Array {

    /**
     * 数组是有序数据的集合，数组中的每个元素具有相同的数据类型，数组名和下标可惟一地确定数组中的元素。
     * 一维数组:
     *  定义方式为：type arrayName=new type[arraySize];
     *  数组元素的引用: arrayName[index]
     * 多维数组:
     *  二维数组的定义: type arrayName[][];
     *  二维数组元素的引用：arrayName[index1][index2]
     */
    int intArray1[] = new int[3];
    int intArray2[] = {1,2,3,4,5};

    int intArray3[][]=new int[2][];
    int intArray4[][]=new int[2][3];
    int intArray5[][]={{1,2},{3,4}};
    {
        intArray3[0]=new int[3];
        intArray3[1]=new int[3];
    }

}
