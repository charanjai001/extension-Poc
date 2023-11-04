import React from 'react';
import Button from './Button';
import './App.css'; // Import the CSS file for additional styling

const App = () => {
  return (
    <div className="container">
      <h1>Choose an Environment:</h1>
      <Button label="Dev1" />
      <Button label="Dev2" />
      <Button label="Dev3" />
    </div>
  );
};

export default App;
