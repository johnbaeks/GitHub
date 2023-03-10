package DynamicProgramming;

public class dynamicProgramming {

    /* 메모

    다이나믹 프로그래밍은 메모리를 적절히 사용하여 수행히간 효율성을 비약적으로 향상

    1. 최적 부분 구조(Optimal Substructure)
    - 큰 문제를 작은 문제로 나눌 수 있으며 작은 문제의 답을 모아서 큰 문제를 해결할 수 있습니다.
    2. 중복되는 부분 문제(Overlapping Subproblem)
    - 동일한 작은 문제를 반복적으로 해결해야 합니다.

    -피보나치수열 코드-
---------------------------------------------------------------------------------------
    다이나믹 프로그래밍 VS 분할 정복
    1. 다이나믹 프로그래밍과 분할 정복은 모두 최적 부분 구조를 가질 때 사용할 수 있습니다.
        - 큰 문제를 작은 문제로 나눌 수 있으며 작은 문제의 답을 모아서 큰 문제를 해결할 수 있는 상황
    2. 다이나믹 프로그래밍과 분할 정복의 차이점은 부분 문제의 중복입니다.
        - 다이나믹 프로그래밍 문제에서는 각 부분 문제들이 서로 영향을 미치며 부분 문제가 중복 됩니다.
        - 분할 정복 문제에서는 동일한 부분 문제가 반복적으로 계산되지 않습니다. -> 퀵정렬에 5의 위치는 정해지고 반복이 안된다.



    1. 주어진 문제가 다이나믹 프로그래밍 유형임을 파악하는 것이 중요

    - 가장 먼저 그리디, 구현, 완전 탐색 등의 아이디어로 문제를 해결할 수 있는지 검토
    -> 다른 알고리즘으로 풀이 방법이 떠오르지 않으면 다이나믹 프로그래밍을 고려
    - 일단 재귀 함수로 비효율적인 완전 탐색 프로그램을 작성한 뒤에 (탑다운) 작은 문제에서 구한 답이 큰 문제에서 그대로 사용될 수 있으면, 코드를 개선하는 방법을 사용
    - 일반적인 코딩 테스트 수준에서는 기본 유형의 다이나믹 프로그래밍 문제가 출제가 되는 경우가 많습니다.

    */

}
