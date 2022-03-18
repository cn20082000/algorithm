## Bài 2: Tập con kế tiếp
- Cho hai số N, K và một tập con K phần tử X[] = (X<sub>1</sub>, X<sub>2</sub>,..., X<sub>K</sub>) của 1, 2,..., N. Nhiệm vụ của bạn là hãy đưa ra tập con K phần tử tiếp theo của X[]. Ví dụ N = 5, K = 3, X[] = {2, 3, 4} thì tập con tiếp theo của X[] là {2, 3, 5}.
- Input:
    + Dòng đầu tiên đưa vào số lượng test T.
    + Những dùng kế tiếp đưa vào các bộ test. Mỗi bộ test gồm hai dòng: dòng thứ nhất là hai số N và K; dòng tiếp theo đưa vào K phần tử của X[] là một tập con K phần tử của 1, 2,..., N.
    + T, K, N, X[] thỏa mãn ràng buộc 1 ≤ T ≤ 100; 1 ≤ K ≤ N ≤ 10<sup>3</sup>.
- Output:
    + Đưa ra kết quả mỗi test theo từng dòng.

<table>
    <tr>
        <th>Input</th>
        <th>Output</th>
    </tr>
    <tr>
        <td>2</br>
        5&emsp;3</br>
        1&emsp;4&emsp;5</br>
        5&emsp;3</br>
        3&emsp;4&emsp;5</td>
        <td>2&emsp;3&emsp;4</br>
        1&emsp;2&emsp;3</td>
    </tr>
</table>
