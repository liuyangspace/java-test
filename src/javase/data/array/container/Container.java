package javase.data.array.container;

/**
 * 容器类
 *
 * Collection
 *      List        // 抽象接口，可重复有序
 *          AbstractList
 *              AbstractSequentialList
 *              ArrayList   // 非同步的（unsynchronized）,快速随机访问元素
 *          LinkedList  // 没有同步方法,快速插入，删除元素
 *          Vector      // 同步,类似ArrayList
 *              Stack   //
 *      Set         // 不包含重复的元素
 *          AbstractSet
 *          HashSet
 *          SortSet
 *              TreeSet
 *      Queue
 *          BlockingQueue
 *          AbstractQueue
 *          Deque
 *              ArrayDeque  // not thread-safe;no capacity restrictions
 *      AbstractCollection
 * Map
 *      Hashtable   // 任何非空（non-null）的对象。同步的
 *      HashMap     // 可空的对象。不同步的 ，但是效率高，较常用。
 *          WeakHashMap     // 改进的HashMap，它对key实行“弱引用”，如果一个key不再被外部所引用，那么该key可以被GC回收。
 *      SortMap     //
 *          TreeMap //
 *      AbstractMap //
 *
 */
public class Container {

}
