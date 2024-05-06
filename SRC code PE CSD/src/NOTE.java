
/**
 *
 * @author PC
 * 
 * Môn CSD201
Lưu ý cách nộp bài thi PE môn CSD201 đúng như sau:
(Sinh viên vui lòng nộp bài theo hướng dẫn này, KHÔNG nhấn vào Submit Guide trên phần 
mềm PEA và đọc thông tin ở đó)
Sinh viên làm theo đúng thứ tự các bước sau (Nếu làm sai, bài thi sẽ bị phần mềm chấm tự động 
bỏ qua và không có điểm) 
Trước khi nộp bài lên PEA 
1. Sinh viên bắt buộc phải Clean and Build project trước khi nộp bài. Mục đích của việc này là 
tạo ra thư mục dist.
2. Đổi tên thư mục dist thành run.
Tiến hành nộp bài: 
- Chọn câu muốn nộp (câu 1, hoặc câu 2) 
- Chọn đường dẫn thư mục chứa toàn bộ Project (Q1, Q2) của bài làm cho câu tương ứng.
- Nhấn Submit
 */
public class NOTE {
    void addFirst(Plane x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }
    
    void addLast(Plane x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }
    
    int size() {
        int i = 0;
        Node p = head;
        while (p != null) {
            i++;
            p = p.next;
        }
        return (i);
    }
    
    Node pos(int k) {
        int i = 0;
        Node p = head;
        while (p != null) {
            if (i == k) {
                return (p);
            }
            i++;
            p = p.next;
        }
        return (null);
    }
    
    
    //TREE
    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if (p.info == x) {
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (x < f.info) {
            f.left = new Node(x);
        } else {
            f.right = new Node(x);
        }
    }
}
