import { BrowserRouter } from 'react-router-dom';
import './App.css';
import Layout from './component/Layout';

function App() {
  return (
    <BrowserRouter>
      <Layout color="white" age="20" size='1080' min="800" atk="77" def="33"/>
    </BrowserRouter>
  );
}

export default App;