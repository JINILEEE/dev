import './App.css';
import Layout from './component/Layout';
import {BrowserRouter} from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Layout color="#0051ba" />
    </BrowserRouter>
  );
}

export default App;
