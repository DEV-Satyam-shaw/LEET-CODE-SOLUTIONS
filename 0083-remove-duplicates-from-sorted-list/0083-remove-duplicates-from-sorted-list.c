/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head == NULL)
    {
        return head;
    }
    struct ListNode *left, *right;
    left = head;  right = head->next;

    while( right != NULL)
    {
        if(left->val == right->val)
        {
            left->next = NULL;
            right = right->next;
        }
        else if(left->val != right->val)
        {
            left->next = right;
            left = left->next;
            right = right->next;
        }
    }
    return head;
}