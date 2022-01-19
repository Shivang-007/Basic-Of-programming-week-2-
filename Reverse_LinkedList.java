#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node *next;
};

struct node* insertnode(int d){
struct node *newnode=(struct node*)malloc(sizeof(struct node));
newnode->data=d;
newnode->next=NULL;	
return newnode;
}
struct node* reverse(struct node* head, struct node* prev)
{    
    if (head == NULL)
        return NULL;
 
    struct node* temp;
    struct node* curr;
    curr = head;  
    while (curr != NULL && curr->data % 2 == 0) {
        temp = curr->next;
        curr->next = prev;
        prev = curr;
        curr = temp;
    }
 
    if (curr != head) {
        head->next = curr;
        curr = reverse(curr, NULL);
        return prev;
    }
    else {
        head->next = reverse(head->next, head);
        return head;
    }
}
void printlist(struct node* head){
while(head!=NULL)
{
	printf("%d ",head->data);
    head=head->next;
}
}

int main(){

int n,d;
scanf("%d",&n);
struct node *head=NULL;
struct node* p;
for(int i=0;i<n;i++){
 scanf("%d",&d);
   if(head==NULL){

   p=insertnode(d);
   head=p;
   continue;
}
	p->next=insertnode(d);
	p=p->next;

}
head=reverse(head,NULL);
printlist(head);
return 0;
}