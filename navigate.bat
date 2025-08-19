@echo off
echo ========================================
echo    DSA with Java - Navigation Helper
echo ========================================
echo.

:menu
echo Choose a DSA category to navigate to:
echo.
echo 1. Arrays (01-arrays)
echo 2. Strings (02-strings)
echo 3. Linked Lists (03-linked-lists)
echo 4. Stacks & Queues (04-stacks-queues)
echo 5. Trees (05-trees)
echo 6. Graphs (06-graphs)
echo 7. Dynamic Programming (07-dynamic-programming)
echo 8. Sorting & Searching (08-sorting-searching)
echo 9. Recursion (09-recursion)
echo 10. Bit Manipulation (10-bit-manipulation)
echo 11. Advanced Algorithms (11-advanced-algorithms)
echo 12. Problem Solving (12-problem-solving)
echo 13. Exit
echo.
set /p choice="Enter your choice (1-13): "

if "%choice%"=="1" (
    cd "01-arrays"
    echo.
    echo Navigated to: Arrays
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="2" (
    cd "02-strings"
    echo.
    echo Navigated to: Strings
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="3" (
    cd "03-linked-lists"
    echo.
    echo Navigated to: Linked Lists
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="4" (
    cd "04-stacks-queues"
    echo.
    echo Navigated to: Stacks & Queues
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="5" (
    cd "05-trees"
    echo.
    echo Navigated to: Trees
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="6" (
    cd "06-graphs"
    echo.
    echo Navigated to: Graphs
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="7" (
    cd "07-dynamic-programming"
    echo.
    echo Navigated to: Dynamic Programming
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="8" (
    cd "08-sorting-searching"
    echo.
    echo Navigated to: Sorting & Searching
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="9" (
    cd "09-recursion"
    echo.
    echo Navigated to: Recursion
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="10" (
    cd "10-bit-manipulation"
    echo.
    echo Navigated to: Bit Manipulation
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="11" (
    cd "11-advanced-algorithms"
    echo.
    echo Navigated to: Advanced Algorithms
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="12" (
    cd "12-problem-solving"
    echo.
    echo Navigated to: Problem Solving
    echo Current directory: %CD%
    echo.
    pause
    cd ..
    goto menu
)
if "%choice%"=="13" (
    echo.
    echo Goodbye! Happy coding and good luck with your DSA journey!
    pause
    exit
)

echo Invalid choice! Please enter 1-13.
pause
goto menu

