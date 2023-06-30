#include <vector>
using namespace std;

class Layer 
{

    public: 
        int numNodesIn, numNodesOut;
        vector<vector<double>> weights;
        vector<double> biases;

        Layer(int numNodesIn, int numNodesOut) {
            this->numNodesIn = numNodesIn;
            this->numNodesOut = numNodesOut;

        }



};