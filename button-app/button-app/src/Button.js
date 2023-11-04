import React from 'react';
import queryString from 'query-string';
import './Button.css'; // Import the CSS file for styling

const Button = ({ label }) => {
  const handleClick = () => {
    const params = { value: label };
    const url = `http://localhost:8080?${queryString.stringify(params)}`;

    fetch(url)
      .then(response => response.json())
      .then(data => {
        console.log(data);
        // Add any additional logic you want to perform after getting the response.
      })
      .catch(error => {
        console.error('Error:', error);
      });
  };

  return (
    <button className="custom-button" onClick={handleClick}>{label}</button>
  );
};

export default Button;
