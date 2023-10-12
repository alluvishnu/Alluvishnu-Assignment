const points = [4,3,7,9];
console.log("Original array:", points);

points.sort(function(a, b) {
  return b - a;
});

console.log("Sorted array (descending order):", points);