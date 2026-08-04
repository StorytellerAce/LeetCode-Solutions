#include <iostream>
#include <vector>
using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode() : val(0), next(nullptr) {}
      ListNode(int x) : val(x), next(nullptr) {}
      ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        vector <int> l1_vec, l2_vec, final_vec;
        ListNode* return_node;
        long long sum1 = 0;
        long long sum2 = 0;
        string sum3;
        while(l1 != nullptr)
        {
            l1_vec.push_back(l1->val);
            l1 = l1->next;
        }
        while(l2 != nullptr)
        {
            l2_vec.push_back(l2->val);
            l2 = l2->next;
        }
        for (int i = l1_vec.size() - 1; i >= 0; i--)
            sum1 = sum1 * 10 + l1_vec[i];
        for (int i = l2_vec.size() - 1; i >= 0; i--)
            sum2 = sum2 * 10 + l2_vec[i];
        sum3 = to_string(sum1 + sum2);
        for (int i = 0; i < sum3.length(); i++)
            final_vec.push_back(int(sum3[i] - '0'));
        return_node = nullptr;
        for (int i = 0; i < final_vec.size(); i++)
        {
            ListNode* new_node = new ListNode(final_vec[i], return_node);
            return_node = new_node;
        }
        return return_node;
    }
};

int main (void)
{
    ListNode l1 = ListNode(3670);
    ListNode l2 = ListNode(20);
    Solution solution1;
    ListNode* test = solution1.addTwoNumbers(&l1, &l2);
    while (test != nullptr)
    {
        cout << test->val;
        test = test->next;
    }
}