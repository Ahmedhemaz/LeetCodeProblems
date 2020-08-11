/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
 function ListNode(val) {
     this.val = val;
     this.next = null;
 }
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    const n = getNumberFromListNode(l1) + getNumberFromListNode(l2);
    const myarray = reverseNumberToArray(n);
    return myarray;
};

function getNumberFromListNode(listNode){
    let listNodeSum = 0;
    let incrementedPower = 0;
    while(listNode){
        listNodeSum += listNode.val * Math.pow(10,incrementedPower);
        incrementedPower++;
        listNode = listNode.next;
    }
    return listNodeSum
}

function reverseNumberToArray(number){
    array = [];
    while(number >=1){
        array.push(number % 10)
        number -= number %10;
        number /=10;
    }
    return array
}
console.log(addTwoNumbers( {
    val: 2,
    next:  { val: 4, next:  { val: 3, next: null } } },
      {
        val: 5,
        next:  { 
            val: 6, next:  { 
                val: 4, next: null } } }))