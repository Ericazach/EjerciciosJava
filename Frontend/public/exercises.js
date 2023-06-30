const numbers = [2, 5, 9, 5, 7]; // 27
const numbs = [];

// find if the sum is odd or even

function oddOrEven(array) {
  let sum = 0;

  for (let i = 0; i < array.length; i++) {
    sum = sum + array[i];
  }

  if (sum % 2 === 0) {
    return "even";
  } else {
    return "odd";
  }
}
console.log(oddOrEven(numbers));

// find multiples

function findMultiples(integer, limit) {
  let multiArray = [];

  for (let i = integer; i <= limit; i++) {
    if (i % integer === 0) {
      multiArray.push(i);
    }
  }

  return multiArray;
}

console.log(findMultiples(2, 6));

// set an alarm

function setAlarm(employed, vacation) {
  return employed && !vacation;
}

console.log(setAlarm(false, true));
